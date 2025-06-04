package a;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

@ExtendWith(Template.MyTestExtension.class)
class Template {

    private static String id;
    
    @Test
    void test(){
        System.out.println(id);
        if (id.contains("SuiteBTest")) {
            Assertions.fail();
        }
    }
    
    public static class MyTestExtension implements BeforeEachCallback {

        @Override
        public void beforeEach(ExtensionContext context) throws Exception {
            id = context.getUniqueId();
        }
    }
}
