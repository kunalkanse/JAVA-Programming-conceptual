#include<stdio.h>
#include<stdlib.h>
// stdlib contain atoi()

int main(int argc, char* argv[])
{	
	int no1 = 0,no2 = 0,ans = 0;
	
	printf("number of arguments : %d\n",argc);
	printf("file name : %s\n",argv[0]);
	
	if(argc == 3)
	{
		//atoi = ascii to integer
		
		no1 = atoi(argv[1]);
		no2 = atoi(argv[2]);
		
		ans = no1 + no2;
		printf("Addition is : %d",ans);
	}
}
