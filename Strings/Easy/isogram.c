#include <stdio.h>

int main()
{
    char str[100];
    int freq[256] = {0};
    int i;

    printf("Enter a string: ");
    scanf("%s", str);

    for(i = 0; str[i] != '\0'; i++)
    {
        freq[str[i]]++;

        if(freq[str[i]] > 1)
        {
            printf("Not Isogram");
            return 0;
        }
    }

    printf("Isogram");

    return 0;
}