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
import ru.javacore.pl.leonchenko.homework6.utils.TwoValuesFromArrayAfterFourTest;

import java.util.Arrays;
import java.util.Collection;




    @RunWith(Parameterized.class)
    public class TVFAAFT {
        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {new int[]{0, 3, 7, 5, 0, 0, 3, 2}},
                    {new int[]{1, 6, 5, 4, 2, 3, 3}, new int[]{2, 3, 3}},
                    {new int[]{4, 3, 7, 5, 4, 4, 3, 2}, new int[]{3, 2}}
            });
        }

        private int[] in;
        private int[] out;

        public TVFAAFT(int[] in, int[] out) {
            this.in = in;
            this.out = out;
        }

        private TwoValuesFromArrayAfterFourTest twoValuesFromArrayAfterFourTest;

        @Before
        public void startTest() {
            twoValuesFromArrayAfterFourTest = new TwoValuesFromArrayAfterFourTest();
        }

        @Test
        public void testTwoValuesFromArrayAfterFourTest() {
            Assert.assertArrayEquals(out, TwoValuesFromArrayAfterFourTest.twoValuesFromArrayAfterFourTestMethod(in));
        }

    }
