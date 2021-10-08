package TarefaUD01_03;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MiObjectOuputStream extends ObjectOutputStream {

    protected MiObjectOuputStream() throws IOException, SecurityException
    {
        super();
    }

    protected MiObjectOuputStream(OutputStream out) throws IOException {
        super(out);
    }

    protected void writeStreamHeader(){
    }
}
