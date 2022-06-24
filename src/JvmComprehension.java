 public class JvmComprehension {
     // В Metaspace загружаются классы JvmComprehension, System class, Integer class
        public static void main(String[] args) {
            int i = 1;                      // 1 В Stack JvmComprehension создается область памяти main(),
            // в которой создается переменная int i = 1;
            Object o = new Object();        // 2 В Stack JvmComprehension в области памяти main() создается
            //ссылочная переменная o, которая ссылается на объект Object, который в свою очередь создается в куче;
            Integer ii = 2;                 // 3 В Stack JvmComprehension создается новый фрейм Integer,
            //  в котором создается переменная ii = 2 и будет ссылаться на объект Integer в куче
            printAll(o, i, ii);             // 4 В Stack JvmComprehension создается новый фрейм printAll(),
            // в котором создаются переменные int i, ссылочная переменная o, которая ссылается на объект
            // Object, находящийся в куче и переменная ii, которая в свою очередь ссылается на объект Integer,
            // находящийся в куче;
            System.out.println("finished"); // 7 В куче создается ???
        }

        private static void printAll(Object o, int i, Integer ii) {
            Integer uselessVar = 700;                   // 5 В фрейм printAll() создается переменная uselessVar,
            // которая ссылается на новый объект Integer в куче, потому что её значение не кэшируется;
            System.out.println(o.toString() + i + ii);  // 6 В Stack JvmComprehension создается новый фрейм System,
            // в котором создаются переменные int i, ссылочная переменная o, которая ссылается на объект
            // Object, находящийся в куче и переменная ii, которая в свою очередь ссылается на объект Integer,
            // находящийся в куче;
        }
    }


