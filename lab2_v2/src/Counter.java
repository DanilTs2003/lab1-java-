//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Counter {
    int[] counter = new int[256];
    FileReader input;
    FileWriter output;

    Counter(String in, String out) {
        try {
            this.input = new FileReader(in);
            this.output = new FileWriter(out, false);
        } catch (IOException var4) {
            System.out.println("Error!");
            System.exit(1);
        }

        for(int i = 0; i < 150; ++i) {
            this.counter[i] = 0;
        }

    }

    boolean run() {
        while(true) {
            try {
                int c;
                if ((c = this.input.read()) != -1) {
                    int var10002 = this.counter[c]++;
                    continue;
                }
            } catch (IOException var3) {
                System.exit(1);
            }

            try {
                for(int j = 0; j < 150; ++j) {
                    String str="";
                    if (this.counter[j] != 0) {
                        if ((char)j != '\n') {
                        str += (char)j;
                        } else {
                           str+="\\n";
                        }
                        str+=" = "+Integer.toString(this.counter[j])+'\n';
                        this.output.append(str);
                    }
                    str="";
                }

                this.output.flush();
                this.output.close();
            } catch (IOException var4) {
                System.exit(1);
            }

            return true;
        }
    }
}
