package me.wonwoo;

import org.junit.jupiter.api.*;

/**
 * Created by wonwoo on 2016. 7. 17..
 */
class StandardTests {

  StandardTests(){

  }

  @BeforeAll
  private static void beforeAll() {
    System.out.println("BeforeAll");
  }

  @BeforeEach
  private void beforeEach() {
    System.out.println("BeforeEach");
  }

  @Test
  void test1() {
    System.out.println("test1");
  }
  @Test
  void test2() {
    System.out.println("test2");
  }

  @Test
  @Disabled("for demonstration purposes")
  void disabled() {
    System.out.println("Disabled");
  }

  @AfterEach
  void afterEach() {
    System.out.println("AfterEach");
  }

  @AfterAll
  static void afterAll() {
    System.out.println("AfterAll");
  }
}

