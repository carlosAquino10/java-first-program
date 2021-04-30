package  com.h2 ;//

public  class  Utilities {

    public  static  long  getLongValue ( String  in ) {
        long out =  Long . MIN_VALUE ;
        tente {
            out =  Long . parseLong (em);
        } catch ( NumberFormatException e) {
            lançar  new  IllegalArgumentException (in +  " não pode ser convertido em um valor 'longo'. Saindo do programa. " );
        }
        voltar para fora;
    }

    public  static  int  getIntValue ( String  in ) {
        int out =  inteiro . MIN_VALUE ;
        tente {
            out =  Inteiro . parseInt (em);
        } catch ( NumberFormatException e) {
            lançar  new  IllegalArgumentException (in +  " não pode ser convertido em um valor 'int'. Saindo do programa. " );
        }
        voltar para fora;
    }

    public  static  float  getFloatValue ( String  in ) {
        flutuar para fora =  flutuar . MIN_VALUE ;
        tente {
            out =  Float . parseFloat (em);
        } catch ( NumberFormatException e) {
            lançar  new  IllegalArgumentException (in +  " não pode ser convertido em um valor 'flutuante'. Saindo do programa. " );
        }
        voltar para fora;
    }
}
