public class Compute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int size=50;
		int[] a=new int[size];
		int[] b=new int[size];
		int[] c=new int[size];
		int[] d=new int[size];
		int[] e=new int[size];
		a=Array(0);//�����������ͬ��������Ϊ�������߱�����
		b=Array(1);//�����������ͬ��������Ϊ�������߼���
		for(i=0;i<50;i++)
		{
			c[i]=(int)(Math.random()*2);
		}
		d=createRandom(a,b,c);//������ʽ���
		e=Range(a,b,c,d);//�����������0-100֮��
		for(i=0;i<50;i++)//��ӡ������
		{
			if(i%5==0)
				System.out.println();
			System.out.print(a[i]);
			if(c[i]==0)
				System.out.print("+");
			else
				System.out.print("-");
			System.out.print(b[i]);
			System.out.print("=");
			System.out.print(e[i]);
			System.out.print("  ");
				
		}		
	}
	
	public static int[] createArray() {//����û���ظ���100λ��
		int i,j=0;
		int size=100;
		int[] myArray=new int[size];
		boolean[] bool=new boolean[size];
		for(i=0;i<100;i++)//�������100������ͬ����
		{
			do {
				j=(int)(Math.random()*100);
			}while(bool[j]);
			bool[j]=true;
			myArray[i]=j;
		}
		return myArray;
	}
	public static int[] Array(int d) {//��100λû���ظ������ֱ���Ϊ50���Ӽ���������
		int size1=50;
		int[] a=new int[size1];
		int[] b=new int[size1];
		int[] c=new int[size1];
		int size2=100;
		int[] myArray=new int[size2];
		int i,j=0;
		myArray=createArray();//�����������100����ͬ�����ĺ���
		for(i=0;i<100;i++)//���������������Ϊ��������
		{
			if(i<50)
			{
				a[i]=myArray[i];
			}
			else
			{
				b[j]=myArray[i];
				j++;
			}
		}
		if(d==0)
			c=a;
		if(d==1)
			c=b;
		return c;
	}
	
	public static int[] createRandom(int[] a,int[] b,int[] c) {//������ʽ���
		int size=50;
		int[] d=new int[size];
		int i;
		for(i=0;i<50;i++)
		{
			if(c[i]==0)
				d[i]=a[i]+b[i];
			if(c[i]==1)
				d[i]=a[i]-b[i];
		}
		return d;
	}
	
	public static int[] Range(int[] a,int[] b,int[] c,int[] d) {//�����������0-100��
		int size=50;
		int[] e=new int[size];
		int i,j;
		for(i=0;i<50;i++)
		{
			if(d[i]>100)
			{
				if(a[i]>=b[i])
				{
					d[i]=a[i]-b[i];
					c[i]=1;
				}
				if(a[i]<b[i])
				{
					d[i]=b[i]-a[i];
					j=b[i];
					b[i]=a[i];
					a[i]=j;
					c[i]=1;
				}
			}
			if(d[i]<0)
			{
				d[i]=b[i]-a[i];
				j=b[i];
				b[i]=a[i];
				a[i]=j;			
			}
			e[i]=d[i];
		}
		return e;
	}
	

}
