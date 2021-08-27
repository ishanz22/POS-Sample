package main;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class Boy implements DI {

    //property injection
    /*SuperGirl g = new Girl();*/

    SuperGirl g;

    /*constructor injection*/
  /*  public Boy(SuperGirl girl) {
        this.g = girl;
    }
*/


    /*    *//*Setter method injection*//*
    public void setInjection(SuperGirl girl) {
        this.g = girl;
    }
    */

    public static void main(String[] args) {
        //new Boy(new Girl()).chatWithGirl();


    /*
      Boy boy = new Boy();
        boy.setInjection(new Girl());
        boy.chatWithGirl();*/

        Boy boy = new Boy();
        boy.inject(new Girl());
        boy.chatWithGirl();

    }

    public void chatWithGirl() {
        /*tight coupling*/
     /*   Girl girl = new Girl();
        girl.chat();*/

        //loos couple
     /*   SuperGirl g = new Girl();
        g.chat();*/

        /*DI */
        g.chat();

    }

    //interface through injection
    @Override
    public void inject(SuperGirl girl) {
        this.g = girl;
    }
}
