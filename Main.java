import java.util.Scanner;

class jogo {

    String jogador1,jogador2;
    int jogadas;
    int pontosJ1,pontosJ2;

    //Construtor

    public jogo(String jogador1, String jogador2){
        this.jogador1=jogador1;
        this.jogador2=jogador2;
        jogadas=0;
        pontosJ1=0;
        pontosJ2=0;
    }

    //Gets and Sets

    public int getJogadas() {
        return jogadas;
    }

    public String getJogador1() {
        return jogador1;
    }
    
    public String getJogador2() {
        return jogador2;
    }

    public int getPontosJ1() {
        return pontosJ1;
    }

    public int getPontosJ2() {
        return pontosJ2;
    }

    public void setJogadas(int jogadas) {
        this.jogadas = jogadas;
    }

    public void setJogador1(String jogador1) {
        this.jogador1 = jogador1;
    }

    public void setJogador2(String jogador2) {
        this.jogador2 = jogador2;
    }

    public void setPontosJ1(int pontosJ1) {
        this.pontosJ1 = pontosJ1;
    }

    public void setPontosJ2(int pontosJ2) {
        this.pontosJ2 = pontosJ2;
    }

    //Metodos
    /*
        1 - Pedra
        2 - Papel
        3 - Tesoura
    */

    String jogar(int opcaoJ1, int opcaoJ2){

        //Empate
        if ((opcaoJ1==1 && opcaoJ2==1) || (opcaoJ1==2 && opcaoJ2==2)
            || (opcaoJ1==3 && opcaoJ2==3))
            {
                jogadas++;
                return "Empate"+"\nNúmero de Jogadas: "+getJogadas()+"\n";
            }

        //Opcoes Jogador 1
        //Pedra
        else if (opcaoJ1==1) {
            if(opcaoJ2==2){
                jogadas++;
                pontosJ2++;
                return "Vitória do "+getJogador2()
                    + "\nJogadas: "+getJogadas()+"\nPontos "+getJogador1()+": "+getPontosJ1()
                    + "\nPontos "+getJogador2()+": "+getPontosJ2();
            }
            if(opcaoJ2==3){
                jogadas++;
                pontosJ1++;
                return "Vitória do "+getJogador1()
                    + "\nJogadas: "+getJogadas()+"\nPontos "+getJogador1()+": "+getPontosJ1()
                    + "\nPontos "+getJogador2()+": "+getPontosJ2();
            }
        }

        //Papel
        else if (opcaoJ1==2) {
            if(opcaoJ2==1){
                jogadas++;
                pontosJ1++;
                return "Vitória do "+getJogador1()
                    + "\nJogadas: "+getJogadas()+"\nPontos "+getJogador1()+": "+getPontosJ1()
                    + "\nPontos "+getJogador2()+": "+getPontosJ2();
            }
            if(opcaoJ2==3){
                jogadas++;
                pontosJ2++;
                return "Vitória do "+getJogador2()
                    + "\nJogadas: "+getJogadas()+"\nPontos "+getJogador1()+": "+getPontosJ1()
                    + "\nPontos "+getJogador2()+": "+getPontosJ2();
            }
        }

        //Tesoura
        else if (opcaoJ1==3) {
            if(opcaoJ2==2){
                jogadas++;
                pontosJ1++;
                return "Vitória do "+getJogador1()
                    + "\nJogadas: "+getJogadas()+"\nPontos "+getJogador1()+": "+getPontosJ1()
                    + "\nPontos "+getJogador2()+": "+getPontosJ2();
            }
            if(opcaoJ2==1){
                jogadas++;
                pontosJ2++;
                return "Vitória do "+getJogador2()
                    + "\nJogadas: "+getJogadas()+"\nPontos "+getJogador1()+": "+getPontosJ1()
                    + "\nPontos "+getJogador2()+": "+getPontosJ2();
            }
        }

        //Opcoes Jogador 2
        //Pedra
        else if (opcaoJ2==1) {
            if(opcaoJ1==2){
                jogadas++;
                pontosJ1++;
                return "Vitória do "+getJogador1()
                    + "\nJogadas: "+getJogadas()+"\nPontos "+getJogador1()+": "+getPontosJ1()
                    + "\nPontos "+getJogador2()+": "+getPontosJ2();
            }
            if(opcaoJ1==3){
                jogadas++;
                pontosJ2++;
                return "Vitória do "+getJogador2()
                    + "\nJogadas: "+getJogadas()+"\nPontos "+getJogador1()+": "+getPontosJ1()
                    + "\nPontos "+getJogador2()+": "+getPontosJ2();
            }
        }

        //Papel
        else if (opcaoJ2==2) {
            if(opcaoJ1==3){
                jogadas++;
                pontosJ1++;
                return "Vitória do "+getJogador1()
                    + "\nJogadas: "+getJogadas()+"\nPontos "+getJogador1()+": "+getPontosJ1()
                    + "\nPontos "+getJogador2()+": "+getPontosJ2();
            }
            if(opcaoJ1==1){
                jogadas++;
                pontosJ2++;
                return "Vitória do "+getJogador2()
                    + "\nJogadas: "+getJogadas()+"\nPontos "+getJogador1()+": "+getPontosJ1()
                    + "\nPontos "+getJogador2()+": "+getPontosJ2();
            }
        }

        //Tesoura
        else if (opcaoJ2==3) {
            if(opcaoJ1==1){
                jogadas++;
                pontosJ1++;
                return "Vitória do "+getJogador1()
                    + "\nJogadas: "+getJogadas()+"\nPontos "+getJogador1()+": "+getPontosJ1()
                    + "\nPontos "+getJogador2()+": "+getPontosJ2();
            }
            if(opcaoJ1==2){
                jogadas++;
                pontosJ2++;
                return "Vitória do "+getJogador2()
                    + "\nJogadas: "+getJogadas()+"\nPontos "+getJogador1()+": "+getPontosJ1()
                    + "\nPontos "+getJogador2()+": "+getPontosJ2();
            }
        }

        //Fim das opcoes
        return "Resultado Inválido";
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Java Jokenpo ====\n");
        int running=1;

        while(running==1){
            String j1,j2;

            System.out.println("Digite o Nome do Jogador 1:");
            j1=sc.next();

            System.out.println("Jogador 1 = "+j1);

            System.out.println("\nDigite o Nome do Jogador 2:");
            j2=sc.next();

            System.out.println("Jogador 2 = "+j2);

            jogo po = new jogo(j1,j2);

            int playing=1;

            System.out.println("\nInício de partida!\nDigite 0 a qualquer momento para encerrar.\n");

            while(playing==1){
                int opc1,opc2;
                System.out.println(j1+", você escolhe Pedra, Papel ou Tesoura?\n");
                System.out.println("1 - Pedra\n2 - Papel\n3 - Tesoura");
                opc1=sc.nextInt();
                  if(opc1==0){
                  playing=0;running=0;
                  System.out.println("\n=== Placar Final ===\n"+"Jogadas: "+po.getJogadas()
                      +"\nPontos "+j1+": "+po.getPontosJ1()+"\nPontos "+j2+": "+po.getPontosJ2());
                  break;}

                System.out.println("\n"+j2+", você escolhe Pedra, Papel ou Tesoura?\n");
                System.out.println("1 - Pedra\n2 - Papel\n3 - Tesoura");
                opc2=(int)Math.floor(Math.random()*(3-1+1)+1);
                System.out.println(opc2);
                  if(opc2==0){
                  playing=0;running=0;
                  System.out.println("\n=== Placar Final ===\n"+"Jogadas: "+po.getJogadas()
                      +"\nPontos "+j1+": "+po.getPontosJ1()+"\nPontos "+j2+": "+po.getPontosJ2());
                  break;}

                System.out.println("\n"+po.jogar(opc1, opc2));
            }

        }
    } 
}