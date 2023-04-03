import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GPT {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Введите количество месяцев: ");
        int m = Integer.parseInt(reader.readLine());

        System.out.print("Введите первоначальную сумму: ");
        double r_start = Double.parseDouble(reader.readLine());

        System.out.print("Введите сумму, которую будем прибавлять в месяц: ");
        double r_m = Double.parseDouble(reader.readLine());
        
        double rub_p = 0.;
        double per = r_start/100.*6./12.;
        double all_m;
        double per_1 = 0.;
        double all_p;
        double r_m_on = 0.;
        
        System.out.println(" ");
        for(int counter = 1; counter <= m; counter++){
            all_m = rub_p+r_start+r_m_on+per;
            all_m = Math.round(all_m * 100.0)/100.0;
            all_p = per_1 + per;
            per_1 = all_p;
            all_p = Math.round(all_p * 100.0)/100.0;
            System.out.println("За " + counter + " месяц получено " + all_m + " рублей, из них процентов - " + all_p );
            rub_p = all_m;
            r_start = 0.;
            r_m_on = r_m;
            per = (r_start+rub_p+r_m)/100.*6./12.;
        }
    }
}