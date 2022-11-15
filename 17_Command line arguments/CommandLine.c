#include<stdio.h>
#include<stdlib.h>

int main(int argc, char* argv[])
{	
	int i = 0;
	printf("number of arguments : %d\n",argc);
	
	for(i = 0; i < argc; i++)
	{
		printf("\nargv[%d] : %s",i,argv[i]);
	}
}
