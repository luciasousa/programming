import static java.lang.System.*;

public class SumArgs
{
  public static void main(String[] args) {
    // Criar array com um elemento por cada argumento do programa:
    double[] arr = new double[args.length];

    // Preencher arr com os valores obtidos dos argumentos:
    for (int i = 0; i < args.length; i++){
		arr[i] =  Integer.parseInt(args[i]);
	}

    // Calcular a soma com função recursiva:
    double total = sumRec(arr, 0, arr.length);
    out.printf("sumRec of arguments = %f\n", total);
	out.printf("sum of arguments = %f\n", sum(arr, 0, arr.length));
    // Verificação de correção do resultado:
    assert total == sum(arr, 0, arr.length);
  }

  // sum of subarray [start,end[ of arr:
  public static double sum(double[] arr, int start, int end) {
    assert arr != null;
    assert start >= 0 && start <= end && end <= arr.length;
    double res = 0;
    for (int i = start; i < end; i++)
      res += arr[i];
    return res;
  }

  // same thing, recursive:
  public static double sumRec(double[] arr, int start, int end) {
    assert arr != null;
    assert start >= 0 && start <= end && end <= arr.length;
    double res = 0;
    int n = 0;
    
    if(arr.length == 1){
		res = arr[start];
	}
	else{
		assert n+1 < end;
		res = arr[start] + sumRec(arr, 0, n+1);
	}
    return res;
  }

}

