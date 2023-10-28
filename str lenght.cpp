#include<stdio.h>
int main() {
	int count=0,arr[10]= {1,2,3,4,7,7},arrR[10];
	while(arr[count]!='\0') {
		count++;
	}

	printf("The length of the arry is %d",count);
	for (int i=0; arr[i]!='\0'; i++) {
		arrR[i]=arr[count-1-i];
	}
	printf("\nThe reverse String is :");
	for(int i=0; arr[i]!='\0'; i++) {
		printf("%d",arrR[i]);
	}
	return 0;
}
