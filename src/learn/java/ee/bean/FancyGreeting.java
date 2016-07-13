package learn.java.ee.bean;

import learn.java.ee.annotations.Fancy;
import learn.java.ee.annotations.Salutation;

import javax.inject.Inject;

/**
 * Created by Ashish.Agarwal on 04/07/2016.
 */
@Fancy
public class FancyGreeting implements Greeting {

    @Inject @Salutation
    String salutation;

    @Override
    public String greet(String name) {
        return "Hello " + salutation + name + ":-)";
    }

}