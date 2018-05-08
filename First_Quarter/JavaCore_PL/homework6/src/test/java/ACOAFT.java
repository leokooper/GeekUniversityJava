/*->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->-/
 *  Java Core. Professional Level                                                                      *
 *  Homework 6. Dev Tools Overview                                                                     *
 *                                                                                                     *
 *  @author Igor Leonchenko                                                                            *
 *  @param url https://github.com/leokooper                                                            *
 *  @version 12.03.2018                                                                                *
 /-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-*/

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.javacore.pl.leonchenko.homework6.utils.ArraysContainsOneAndFourTest;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ACOAFT {
        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {new int[]{1, 1, 4, 4, 1, 1, 4, 4}, true},
                    {new int[]{1, 2, 3, 4, 5, 6, 7, 8}, false},
                    {new int[]{1, 1, 4, 6, 5, 7, 9, 0}, false}
            });
        }
        private int[] in;
        private boolean out;

        public ACOAFT (int[] in, boolean out) {
            this.in = in;
            this.out = out;
        }

        private ArraysContainsOneAndFourTest arraysContainsOneAndFourTest;

        @Before
        public void startTest() {
            arraysContainsOneAndFourTest = new ArraysContainsOneAndFourTest();
        }

        @Test
        public void testArraysContainsOneAndFourTest() {
            Assert.assertEquals(ArraysContainsOneAndFourTest.arraysContainsOneAndFourTestMethod(in), out);
        }
}
