import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class InputsTeste {

    @Test
    public  void UmaCordenda(){
        String Passos="N";

        Pessoa Ash= new Pessoa("Ash",0,0,1);
        
        //Ash.movimento(Passos,Ash);

        Assert.assertEquals(Ash.movimento(Passos,Ash),2);
    }

    @Test
    public void QuatroCordenadas(){
        String Passos="NESO";

        Pessoa Ash= new Pessoa("Ash",0,0,1);

        //Ash.movimento(Passos,Ash);

        Assert.assertEquals(Ash.movimento(Passos,Ash),4);
    }

    @Test
    public void CordenadasNumeros(){
        String Passos="1234";

        Pessoa Ash= new Pessoa("Ash",0,0,1);


         //Como são digitos o Ash não sai do lugar no entanto ele ja começa com um pokemon logo o resultado é um
        Assert.assertEquals(Ash.movimento(Passos,Ash),1);
    }


    @Test
    public void CordenadasMisturaDigitoString(){

        String Passos="1N2E3S4O";

        Pessoa Ash= new Pessoa("Ash",0,0,1);


        //Como são digitos o Ash não sai do lugar no entanto ele ja começa com um pokemon logo o resultado é um
        Assert.assertEquals(Ash.movimento(Passos,Ash),4);

    }

    @Test
    public void CordenadaNull(){
        String Passos="";

        Pessoa Ash= new Pessoa("Ash",0,0,1);


        //Como são digitos o Ash não sai do lugar no entanto ele ja começa com um pokemon logo o resultado é um
        Assert.assertEquals(Ash.movimento(Passos,Ash),1);
    }

    @Test
    public void CordenadaSpace(){
        String Passos=" ";

        Pessoa Ash= new Pessoa("Ash",0,0,1);


        //Como são digitos o Ash não sai do lugar no entanto ele ja começa com um pokemon logo o resultado é um
        Assert.assertEquals(Ash.movimento(Passos,Ash),1);
    }


    @Test
    public void CordenadaAndarAsVoltas(){
        String Passos="NESONESONESONESONESONESONESONESONESONESONESO";

        Pessoa Ash= new Pessoa("Ash",0,0,1);


        //Como são digitos o Ash não sai do lugar no entanto ele ja começa com um pokemon logo o resultado é um
        Assert.assertEquals(Ash.movimento(Passos,Ash),4);
    }

    @Test
    public void CordenadaAleatoriosMistura(){
        String Passos="NES4ONESONE$SONESONESON=ESONESONESONESONESONESO";

        Pessoa Ash= new Pessoa("Ash",0,0,1);


        //Como são digitos o Ash não sai do lugar no entanto ele ja começa com um pokemon logo o resultado é um
        Assert.assertEquals(Ash.movimento(Passos,Ash),4);
    }
}
