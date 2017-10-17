package me.wonwoo.standard;

import org.junit.*;

/**
 * Created by wonwoo on 2016. 7. 17..
 */
public class Junit4Test {
  public Junit4Test(){
  }

  @BeforeClass
  public static void beforeClass(){
    System.out.println("beforeClass");
  }

  @Before
  public void setup(){
    System.out.println("setup");
  }

  @Test
  public void test1(){
    System.out.println("test1");
  }
  @Test
  public void test2(){
    System.out.println("test2");
  }

  @After
  public void after(){
    System.out.println("after");
  }

  @Ignore
  @Test
  public void ignore(){
    System.out.println("ignore");
  }

  @AfterClass
  public static void afterClass(){
    System.out.println("afterClass");
  }
}
