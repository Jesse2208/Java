
public class alibaba {
	static boolean ref(int []A){
		int N=A.length;
		int symbol=0,m1=1,m2,m3=N-2,i;
		int sum1=0,sum2=0,sum3=0,sum4=0;
		sum1+=A[m1-1];
		sum4+=A[m3+1];
		while(true){
			if(m1<m3){
			if(sum1==sum4){
				for(i=m1+1;i<m3-1&&sum2<sum1;i++)
					sum2+=A[i];
				if(sum2==sum1){
					m2=i;
					for( i=m2+1;i<m3&&sum3<sum1;i++)
						sum3+=A[i];
					if(sum3==sum1)
						return true;
					else sum1+=A[m1++];
				}
				else if (i==m3-1)
					return false;
				else sum1+=A[m1++];
				
			}
			else if(sum1>sum4)
					sum4+=A[m3--];
			else sum1+=A[m1++];
			}
			else return false;
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={3,4,9,6,1,3,7,8,6,1};
		System.out.println(alibaba.ref(a));
	}

}
