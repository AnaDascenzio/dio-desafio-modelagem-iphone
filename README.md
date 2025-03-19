# Desafio modelagem UML iphone 💻

A proposta é a construção de um diagrama UML para representar o que um iphone pode fazer de acordo com o vídeo de lançamento [lançamento iphone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

[material de apoio](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo)

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
    }
    
    class AparelhoTelefonico {
        +ligar(numero: String)
        +atender()
        +iniciarCorreioVoz()
    }
    
    class NavegadorInternet {
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }
    
    class Iphone {
    }
    
    ReprodutorMusical -- Iphone
    AparelhoTelefonico -- Iphone
    NavegadorInternet -- Iphone
```

