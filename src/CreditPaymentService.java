public class CreditPaymentService {
    public int calculate(int loanAmount, double yearPercent, int numberOfMonths) {
        double index = yearPercent / numberOfMonths / 100;
        double monthPay = (index * (Math.pow((1 + index), numberOfMonths))) /
                (((Math.pow((1 + index), numberOfMonths)) - 1)) * loanAmount;


        return (int) monthPay;


    }
}


// 1) loanAmount*((index((index+1)
// 2) 1 плюс (ставка деленная на кол месяцев деленная на 100
// 3) результат 2 го дейставия возвести в количества месяцев
// 4) результат 3го действия отнять 1
// 5) резульат 4го действия отнять 1
// 6)ставка деленная на количество месяцев разделить на результат 5го действия
// 7) ставка деленная на колличество месяцев прибавить результать 6го действия
// 8) результат 7 действия умнодить на сумму долго

// return Math.round(payment);
