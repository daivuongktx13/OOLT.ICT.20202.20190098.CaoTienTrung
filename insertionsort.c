#include <stdio.h>
void insertionsort(int a[],int n){
	int i;
	for(i=1;i<n;i++){
		int temp=a[i],j=i;
		while(j>0&&a[j-1]>temp){
			a[j]=a[j-1];
			j--;
		}
		a[j]=temp;
	}
}
int main(){
	int a[]={2,6,8,9,1,4,3,5,1,2,3,4};
	int n=12,i;
	insertionsort(a,n);
	for(i=0;i<n;i++) printf("%d ",a[i]);
	return 0;
}
