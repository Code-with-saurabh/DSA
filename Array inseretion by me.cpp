#include <stdio.h>

int main() {
	int cpacity=20;
	int arr[cpacity]= {1,2,5,8,6,3,47,9,6};
	int size=0;
	int index,element;

	for(int i=0; arr[i]!='\0'; i++) {
		size++;
	}
	
	printf("Enter The Element Which You Wnat To Inseart : ");
	scanf("%d",element);
	
	printf("Enter The Index Where You Want To Inseart : ");
	scanf("%d",index);
	
	if(size>=cpacity){
		printf("Array OverFlow..");
		return -1;
	}
	
	if(cpacity<=index){
		printf("The %d index is larger The cpacity of array ",index);
		return -1;
	}
	
	for(int i=size-1;i>=index;i--){
		
		arr[i+1]=arr[i];
	}
	arr[index]=element;
	size+=1;
	
	for(int i=0;i<size;i++){
		printf(" %d,",arr[i]);
	}
	return 0;
}
