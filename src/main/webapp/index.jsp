<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html lang="pt-br">
    
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Painel de Controle | Atendente</title>
        <link rel="stylesheet" href="./assets/css/root.css">
        <link rel="stylesheet" href="./assets/css/attendantpanel.css">
        <link rel="apple-touch-icon" sizes="180x180" href="../webapp/assets/img/favicon/apple-touch-icon.png">
        <link rel="icon" type="image/png" sizes="32x32" href="./webapp/assets/img/favicon/favicon-32x32.png">
        <link rel="icon" type="image/png" sizes="16x16" href="./webapp/assets/img/favicon/favicon-16x16.png">
        <script src="https://kit.fontawesome.com/33abab1032.js" crossorigin="anonymous"></script>
    </head>
    
    <body id="body">
        <div class="container">
            <aside class="sidebar">
                <div class="sidebar-container">
                    <div>
                        <img src="./assets/img/logo/petmania-black-153.png" alt="Logomarca PetMania" height="105">
                        <h1>Indentifique-se<br><span></span></h1>
                    </div>
                    <div class="sidebar-content">
                        <a href="./Atendente/listar.cliente.jsp">
                        <button class="sidebar__button btn-client" role="button" type="button"><i
                                    class="fa-solid fa-user-pen"></i>
                                 Atendente</button>
                        </a>
                        <a href="./Veterinaria/lista.consultas.jsp">
                            <button class="sidebar__button btn-client btn-animal" role="button" type="button"><i class="fa-solid fa-paw"></i>
                                 Veterinario</button>
                        </a>
                        
                    </div>
                </div>
        </aside>
            
        </div>
    </body>
    
    </html>