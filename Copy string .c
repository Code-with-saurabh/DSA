#include <stdio.h>
int main () {
 char str[100],Copy_str[100];
 int i=0,count=0;
 printf("Enter String : ");
 scanf("%s",&str);
for(i;str!=NULL;i++) {
	str[i]=Copy_str[i];
}
printf("The Copyed String is %s ",Copy_str);
	return 0;
}




