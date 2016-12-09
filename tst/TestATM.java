import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;


public class TestATM {
    //create a mock of Controller
    private Scene1Controller controller1 = mock(Scene1Controller.class);
    private Scene2Controller controller2 = mock(Scene2Controller.class);
    private Scene5Controller controller5 = mock(Scene5Controller.class);
    private Scene6Controller controller6 = mock(Scene6Controller.class);
    private Scene7Controller controller7 = mock(Scene7Controller.class);
    private Scene13Controller controller13 = mock(Scene13Controller.class);

    @Test
    public void testScene1(){
        Assert.assertTrue(controller1 instanceof  Scene1Controller);
    }
    @Test
    public void testScene2(){
        Assert.assertTrue(controller2 instanceof  Scene2Controller);
    }
    @Test
    public void testScene5(){
        Assert.assertTrue(controller5 instanceof Scene5Controller);
    }
    @Test
    public void testScene6(){
        Assert.assertTrue(controller6 instanceof  Scene6Controller);
    }
    @Test
    public void testScene7(){
        Assert.assertTrue(controller7 instanceof  Scene7Controller);
    }
    @Test
    public void testScene13(){
        Assert.assertTrue(controller13 instanceof  Scene13Controller);
    }

    @Test
    public void testCardNum() {
        javafx.event.ActionEvent myEvent = new javafx.event.ActionEvent();
        controller1.toPinEntry(myEvent);

        doReturn("Going to PIN entry").when(controller2).getScreenTwo();
        Assert.assertSame("Going to PIN entry", controller2.getScreenTwo());

    }

    @Test
    public void testViewBalance() {
        javafx.event.ActionEvent myEvent = new javafx.event.ActionEvent();
        controller5.toBalance(myEvent);

        doReturn("Getting Your Balance").when(controller6).getBalance();
        Assert.assertSame("Getting Your Balance", controller6.getBalance());

    }

    @Test
    public void testMakeDeposit(){
        javafx.event.ActionEvent myEvent = new javafx.event.ActionEvent();
        controller5.toDeposit(myEvent);

        doReturn("Making a deposit").when(controller13).makeDeposit();
        Assert.assertSame("Making a deposit", controller13.makeDeposit());
    }

    @Test
    public void testMakeWithdrawal(){
        javafx.event.ActionEvent myEvent = new javafx.event.ActionEvent();
        controller5.toWithdrawal(myEvent);

        doReturn("Making a withdrawal").when(controller7).makeWithdrawal();
        Assert.assertSame("Making a withdrawal", controller7.makeWithdrawal());
    }

}