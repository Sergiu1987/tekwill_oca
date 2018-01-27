package class_practice.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MyList extends ArrayList {

    public void updateIf(Predicate con, UnaryOperator operator){

        for ( int i=0; i < size(); i++) {
            if (con.test(get(i))){
                Object newValue = operator.apply(get(i));
                set(i, newValue);

            }

        }



    }
}
