
package com.mycompany.swing;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class alertaParaTelegram {
    
    private Long mediaMemoria;
    private List<dadosFuncionarioOcioso> listFuncionarios = new ArrayList<>();
    
    
    Connection config = new Connection();
    JdbcTemplate con = new JdbcTemplate(config.getDatasource());
    
    public Long getMedia()
    {        
         List<mediaMemoria> comandoMedia = con.query(
                 "select round(avg(memoriaEmUso),0) AS mediaMemoria from [dbo].[Historico]",
            new BeanPropertyRowMapper(mediaMemoria.class));
        
        
       for(mediaMemoria media : comandoMedia)
       {
           mediaMemoria = media.getMediaMemoria();
       }
       
       
            return mediaMemoria + mediaMemoria;
    }
     
    public String getAbaixoDaMedia()
    {
           
        List<mediaMemoria> mediaMemoriaSelect = con.query("select fkMaquina AS idMaquina, "
                + "round(avg(memoriaEmUso),0) AS mediaMemoria\n" +
                                "from [dbo].[Historico] group by fkMaquina", 
                new BeanPropertyRowMapper(mediaMemoria.class));
        
        for(mediaMemoria media : mediaMemoriaSelect)
        {
            if(media.getMediaMemoria() < getMedia())
            {
           //     mediaMemoria usuarioOcioso = new mediaMemoria(media.getIdMaquina(), media.getMediaMemoria());
                
                          
                getFuncionarioOcioso(media.getIdMaquina());
            }
        }
        if(listFuncionarios.isEmpty())
        {
         return "Nenhum usuário ocioso";
        }
        else
        {
            return listFuncionarios.toString();
        }
        
    }
    
    public void getFuncionarioOcioso(Integer idMaquina)
    {
        
        String select = String.format("select top 1 idFuncionario, Nome,Cargo,\n" +
                                      "hostName,\n" +
                                      "tempoInicializado\n" +
                                    " from [dbo].[FUNCIONARIO] join [dbo].[Maquina] "
                                     + "on idFuncionario = fkUsuario\n" +
                                    " join [dbo].[Historico] "
                + "on fkMaquina = idMaquina where idMaquina = %d", idMaquina);
        
         List<dadosFuncionarioOcioso> funcionario = con.query(select, 
                new BeanPropertyRowMapper(dadosFuncionarioOcioso.class));
         
         for(dadosFuncionarioOcioso dados : funcionario)
         {
        //     dadosFuncionarioOcioso funcionarioToString = new dadosFuncionarioOcioso
        //(dados.getIdFuncionario(), dados.getNome(), dados.getCargo(), dados.getHostName(), 
          //      dados.getTempoInicializado());
             
             listFuncionarios.add(dados);            
          
         }
         //  return listFuncionarios;
    }
   
//select top 10 usoMemoria from [dbo].[Processos]
//join [dbo].[Maquina] on fkMaquina = idMaquina where idMaquina = 1  
//order by usoMemoria desc 
}
