#include <iostream>

int main () {
 char str[100],Rstr[100];
 int i=0,count=0;
 printf("Enter String : ");
 scanf("%s",&str);
for(i;str!=NULL;i++) {
	str[i]=Rstr[i];
}
printf("The Copyed String is %s ",Rstr);
	return 0;
}




