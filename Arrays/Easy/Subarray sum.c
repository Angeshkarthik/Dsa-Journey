#include<stdio.h>
int main(){
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
  }
  int target;
  scanf("%d",&target);
  for(int i=0;i<n;i++){
    int sum=0;
    for(int j=i;j<n;j++){
      sum+=arr[j];
      if(sum==target){
        for(int k=i;k<=j;k++){
          printf("%d ",arr[k]);
        }
        printf("\n");
      }
    }
  }
}