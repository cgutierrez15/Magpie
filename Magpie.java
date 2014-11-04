/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *       Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
 /**
  * Get a default greeting  
  * @return a greeting
  */
 public String getGreeting()
 {
  return "Hello, let's talk.";
 }
 
 /**
  * Gives a response to a user statement
  * 
  * @param statement
  *            the user statement
  * @return a response based on the rules given
  */
 public String getResponse(String statement)
 {
  String response = "";
  if (statement.indexOf("no") >= 0)
  {
   response = "Why so negative?";
  }
  if (statement.indexOf("mother") >= 0
    || statement.indexOf("father") >= 0
    || statement.indexOf("sister") >= 0
    || statement.indexOf("brother") >= 0)
  {
   response = "Tell me more about your family.";
  }
   if (statement.indexOf("dog") >= 0
    || statement.indexOf("cat") >= 0
    || statement.indexOf("fish") >= 0
    || statement.indexOf("bird") >= 0)
  {
   response = "Tell me more about your pets.";
  }
    if (statement.indexOf("car") >= 0
    || statement.indexOf("drive") >= 0
    || statement.indexOf("tire") >= 0
    || statement.indexOf("crash") >= 0)
  {
   response = "Tell me more about your car.";
  }
    if (statement.indexOf("camera") >= 0
    || statement.indexOf("photo") >= 0
    || statement.indexOf("picture") >= 0
    || statement.indexOf("image") >= 0)
  {
   response = "Tell me more about your photography.";
  }
    if (statement.indexOf("Mr.") >= 0)
  {
   response = "He sounds like a good teacher.";
  }
    if (statement.indexOf("Mrs.") >= 0)
  {
   response = "She sounds like a good teacher.";
  }
   if (statement.trim().length() == 0)
  {
   response = "Say something to me!";
  }
        
  else
  {
   response = getRandomResponse();
  }
  return response;
 }

 /**
  * Pick a default response to use if nothing else fits.
  * @return a non-committal string
  */
 private String getRandomResponse()
 {
  final int NUMBER_OF_RESPONSES = 6;
  double r = Math.random();
  int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
  String response = "";
  
  if (whichResponse == 0)
  {
   response = "Interesting, tell me more.";
  }
  else if (whichResponse == 1)
  {
   response = "Hmmm.";
  }
  else if (whichResponse == 2)
  {
   response = "Do you really think so?";
  }
  else if (whichResponse == 3)
  {
   response = "You don't say.";
  }
    else if (whichResponse == 4)
  {
   response = "What makes you say that?";
  }
      else if (whichResponse == 5)
  {
   response = "Congratulations! You have received one of 6 randomly generated responses!";
  }

  return response;
 }
}

// In order to prioritize responses, the reply methods would have to be arranged. 
//Or, and and statement what would say when the sentence has "mother" and "dog" 
//it could incorporate a reply with both, or use the last word. 
//The problem with question1, is that it will respond with a question for vegtables
// specifically rather than vegtables smothered in cheese, which is what the human is talking about 

