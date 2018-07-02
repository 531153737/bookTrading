/**
 * Section 4.1.5
 *
 * definition of the BookBuyerGui interface 
 **/

package bookTrading.buyer;

public interface BookBuyerGui {
  void setAgent(BookBuyerAgent a);
  void show();
  void hide();
  void notifyUser(String message);
  void dispose();
}