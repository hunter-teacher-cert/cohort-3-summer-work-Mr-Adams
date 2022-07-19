1. Come up with TNPG (TGIF--Jihae P	Yeidy L	Seth A	Shana)
2. Read CODE for understanding. Check in with your group if there is any confusion. (Note this is A solution the the problem, not THE solution).
3. Annotate CODE with the provided TEACHER PROMPTS as comments.
*PROVIDE :: code snippets or comments you definitely want to provide
*STUDENT-PROMPT :: a specifically-worded question you want to ask, or a general solicitation for input, etc
*MUST-ANSWER-Q :: a question that must be resolved, that a majority of your class must understand before moving on
*BIG IDEA :: an introduction of a new topic, a connection to prior lesson or discussion for application here in code, etc.
*BEEG REVEAL :: this is gonna blow yer minds...
*DELIBERATE-ERROR :: specific code snippet or a general approach that is a bad fit for the situation, is flat-out wrong, or will lead to a compile- or run-time error, etc.
*FIRSTDRAFT :: code that will work for now, but which you intend to replace later
*REVISION vX :: better versions of firstdraft code...
5. DELIVERABLE:  One person per group reply to this post with...
  - MSG: <TNPG> <your fully annotated code formatted as a code block>

1. TNPG = TGIF
2. 

/*BIG/GOOD IDEA - Live chart with an ArrayList to model make the steps concrete.  Utlize screen shots of Java Tutor*/
/*Do this all the time.  Under the hood--build to challenge to father all or next value*/

  public int linearSearch(int value, ArrayList<Integer> data)/*PROVIDE  *STUDENT-PROMPT Ask what do they think will be needed inside the method? put answers in comment*/
    int foundIndex /*PROVIDE*/ = -1;/*STUDENT-PROMPT What is the best value to put here?*/

    for (int i=0; i < data.size()/*DELIBERATE-ERROR If still struggling with for loops do the conditional incorrectly.*//*same thing as data.length*/; i++) {//*PROVIDE Give students this comment here to connection/remind

      int element = data.get(i);

      if (element == value)/*PROMPT where do we get value from*/ {
        foundIndex = i;
        break;//*DELIBERATE-ERROR do not include to show incorrect test ->without this would only return last item that matches *BIG IDEA - Why this actually functions the way we want and why the information is valuable.  
        }
      }
    return foundIndex;//if not found what will return?
  }