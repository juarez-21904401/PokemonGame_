import java.util.ArrayList;

public class Pessoa {
    String nome;
    int x=0;
    int y=0;
    int numeropokemons=1;

    public int  getnumeroPokemons() {
        return numeropokemons;
    }

    public String getNome() {
        return nome;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    Pessoa(String nome,int x, int y, int pokemons) {
        this.nome = nome;
        this.x=x;
        this.y=y;
        this.numeropokemons=numeropokemons;
    }

    Pessoa() {
    }

    public int  movimento(String Passos, Pessoa Ash){

        char N='N', S='S', O='O', E='E';

        Campo campo= new Campo();

        // Criar e colocar os pokemons cada um na sua cordenada
        for(int x=-1000; x<=1000;x++) {
            for(int y=-1000;y<=1000;y++ ){
                Pokemon pikaxu= new Pokemon(x,y);
                campo.pokemons.add(pikaxu);
            }
        }


        for(int j=0; j < campo.pokemons.size(); j++){
            //Remover o pokemon que esta na posição 0,0
            if(campo.pokemons.get(j).y==0 && campo.pokemons.get(j).x==0){
                campo.pokemons.remove(j);
            }
        }

        for(int i=0 ; i<Passos.length();i++){

            if(Passos.charAt(i)==N && Integer.MAX_VALUE > Ash.y){
                Ash.y++;
                //Verificar quantos pokemons ha no campo
                for(int j=0; j < campo.pokemons.size(); j++){
                    //Verificar se no campo ha pokemons com as mesmas cordenadas que o Ash
                    if(campo.pokemons.get(j).y==Ash.y && campo.pokemons.get(j).x==Ash.x){
                        campo.pokemons.remove(j);
                        Ash.numeropokemons++;
                    }
                }
            }
            if(Passos.charAt(i)==S && Integer.MIN_VALUE < Ash.y){
                Ash.y--;
                for(int j=0; j < campo.pokemons.size(); j++){
                    //Verificar se no campo ha pokemons com as mesmas cordenadas que o Ash
                    if(campo.pokemons.get(j).y==Ash.y && campo.pokemons.get(j).x==Ash.x){
                        campo.pokemons.remove(j);
                        Ash.numeropokemons++;
                    }
                }
            }
            if(Passos.charAt(i)==O && Integer.MAX_VALUE > Ash.x){
                Ash.x++;
                for(int j=0; j < campo.pokemons.size(); j++){
                    //Verificar se no campo ha pokemons com as mesmas cordenadas que o Ash
                    if(campo.pokemons.get(j).y==Ash.y && campo.pokemons.get(j).x==Ash.x){
                        campo.pokemons.remove(j);
                        Ash.numeropokemons++;
                    }
                }
            }
            if(Passos.charAt(i)==E && Integer.MIN_VALUE < Ash.x){
                Ash.x--;
                for(int j=0; j < campo.pokemons.size(); j++){
                    //Verificar se no campo ha pokemons com as mesmas cordenadas que o Ash
                    if(campo.pokemons.get(j).y==Ash.y && campo.pokemons.get(j).x==Ash.x){
                        campo.pokemons.remove(j);
                        Ash.numeropokemons++;
                    }
                }
            }
        }

        return Ash.numeropokemons;
    }
}
