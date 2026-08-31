#include<stdio.h>
#include<string.h>
#include<ctype.h>

int main()
{
    char str[100];

    fgets(str,100,stdin);
    str[strcspn(str,"\n")]='\0';

    if(strchr(str,'@') != NULL)
    {
        // Email masking
        for(int i=1; str[i]!='@'; i++)
        {
            if(isalpha(str[i]) || isdigit(str[i]) || str[i]=='.')
            {
                str[i]='*';
            }
        }
    }
    else
    {
        // Card number masking
        int len = strlen(str);
        int digitcount = 0;

        for(int i=0; i<len; i++)
        {
            if(isdigit(str[i]))
            {
                digitcount++;
            }
        }

        int keep = 4;

        for(int i=0; i<len; i++)
        {
            if(isdigit(str[i]))
            {
                if(digitcount > keep)
                {
                    str[i]='*';
                    digitcount--;
                }
                else
                {
                    break;
                }
            }
        }
    }

    printf("%s",str);

    return 0;
}
