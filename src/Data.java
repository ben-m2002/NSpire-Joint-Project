import java.util.*;

public class Data {
  private Map<Set<String>, String> map = new HashMap<>();
  private Set<String> allSets = new HashSet<>(Arrays.asList("lady", "ladies", "girl", "girl", "daughter",
          "wife", "mom", "grand mother", "women", "guy", "guys", "boy", "boys", "husband", "son",
          "dad", "father", "grand father", "men", "boy", "boys", "little boys", "little boy", "big boy",
          "big boys", "teen", "youth", "son", "girl", "girls", "little girl", "big girls", "teens", "youth",
          "daughter", "button shirt", "t-shirt", "top", "formal shirt", "dress shirt",
          "stripe shirt", "casual shirt", "sports shirt", "party shirt", "shirt", "button", "silk blouse", "cotton blouse", "v-neck blouse",
          "round-neck-blouse", "sleeve", "blouse", "sports t-shirt", "casual t-shirt", "t-shirt",
          "pants", "jeans", "straight fit jeans", "wide legged jeans", "long dress", "short dress", "party dress",
          "casual dress", "dress", "off white", "pure white", "ivory", "cream", "white", "charcoal", "ebony", "jet black", "olive black", "black",
          "navy blue", "sky blue", "midnight blue", "light blue", "blue", "lime green", "olive green", "emerald", "sage", "green",
          "lemon", "yellow", "orange", "golden yellow", "saffron", "blood red", "red", "fire red", "apple red", "hot red"
  ));

  private HashSet<String> womenDivision = new HashSet<>(Arrays.asList("lady", "ladies", "girl", "girl", "daughter",
          "wife", "mom", "grand mother", "women"
  ));
  private HashSet<String> menDivision = new HashSet<>(Arrays.asList("guy", "guys", "boy", "boys", "husband", "son",
          "dad", "father", "grand father", "men"
  ));
  private HashSet<String> boyDivision = new HashSet<>(Arrays.asList("boy", "boys", "little boys", "little boy", "big boy",
          "big boys", "teen", "youth", "son"
  ));
  private HashSet<String> girlDivision = new HashSet<>(Arrays.asList("girl", "girls", "little girl", "big girls", "teens", "youth",
          "daughter"
  ));

  private HashSet<String> shirtType = new HashSet<>(Arrays.asList("button shirt", "t-shirt", "top", "formal shirt", "dress shirt",
          "stripe shirt", "casual shirt", "sports shirt", "party shirt", "shirt", "button"
  ));
  private HashSet<String> blouseType = new HashSet<>(Arrays.asList("silk blouse", "cotton blouse", "v-neck blouse",
          "round-neck-blouse", "sleeve", "blouse"
  ));
  private HashSet<String> tshirtType = new HashSet<>(Arrays.asList("sports t-shirt", "casual t-shirt", "t-shirt"
  ));
  private HashSet<String> jeanType = new HashSet<>(Arrays.asList("pants", "jeans", "straight fit jeans", "wide legged jeans"
  ));
  private HashSet<String> dressType = new HashSet<>(Arrays.asList("long dress", "short dress", "party dress", "casual dress",
          "dress"
  ));

  private HashSet<String> adultSize = new HashSet<>(Arrays.asList("size 4"," size 5", "size 6", "size 7", "size 8", "size 9", "size 10",
          "size 11", "size 12", "size 13", "size 14", "size 15", "size 16", "size 17", "size 18"));
  private HashSet<String> childSize = new HashSet<>(Arrays.asList("2 year old", "age 2", "toddler", "teen", "teenage", "youth",
          "two year old", "second", "2 year", "3 year", "2 T", "Y18"
  ));

  private HashSet<String> whiteColor = new HashSet<>(Arrays.asList("off white", "pure white", "ivory", "cream", "white"));
  private HashSet<String> blackColor = new HashSet<>(Arrays.asList("charcoal", "ebony", "jet black", "olive black", "black"));
  private HashSet<String> blueColor = new HashSet<>(Arrays.asList("navy blue", "sky blue", "midnight blue", "light blue", "blue"));
  private HashSet<String> greenColor = new HashSet<>(Arrays.asList("lime green", "olive green", "emerald", "sage", "green"));
  private HashSet<String> yellowColor = new HashSet<>(Arrays.asList("lemon", "yellow", "orange", "golden yellow", "saffron"));
  private HashSet<String> redColor = new HashSet<>(Arrays.asList("blood red", "red", "fire red", "apple red", "hot red"));

  public Data (){

  }
}
