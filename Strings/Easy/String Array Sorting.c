#include<stdio.h>
#include<string.h>
#include<ctype.h>
int main(){
  int n;
  scanf("%d",&n);
  char str[n][20];
  for(int i=0;i<n;i++){
    scanf("%s",str[i]);
  }
  for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
    if(strcmp(str[i],str[j])>0){
      char t[20];
      strcpy(t,str[i]);
      strcpy(str[i],str[j]);
      strcpy(str[j],t);
    }
  }
}
  for(int i=0;i<n;i++){
    printf("%s\n",str[i]);
  }
}