package Page;

import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test2 extends SoftAssert {

   //     @Override
    //    public void onAssertSuccess(IAssert<?> assertCommand) {
    //        System.err.println(assertCommand.getMessage() + " <PASSED> ");
   //     }

        @Override
        public void onAssertFailure(IAssert<?> assertCommand, AssertionError ex) {
            String suffix =
                    String.format(
                            "Фактический результат [%s] Ожидаемый результат [%s]",
                            assertCommand.getExpected().toString(), assertCommand.getActual().toString());
            System.err.println(assertCommand.getMessage() + " <FAILED>. " + suffix);
        }
    }

