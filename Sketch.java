import processing.core.PApplet;

public class Sketch extends PApplet {

  public void settings() {
	// Size call
    size(1200, 600);
  }

  /** 
   * Background
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 3 + intRow;
        intY = 300 + 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 300; intRow < 600; intRow += 20){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 3 + intRow;
        intY = 300 + 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

        fill(0);
        noStroke();
        rect(intX + 10, intY, 5, 5); 
      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 600; intRow < 900; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 20){
        intX = 3 + intRow;
        intY = 300 + 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY + 10, 5, 5);

        fill(0);
        noStroke();
        rect(intX, intY, 5, 5); 
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 900; intRow < 1200; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 3 + intRow;
        intY = 300 + 3 + intColumn;

        fill(0);
        noStroke();
        rect(intX, intY, 5, 5); 

        for(int intRow2 = 890; intRow2 < 1200; intRow2 += 20){
        for(int intColumn2 = 10; intColumn2 < 320; intColumn2 += 20){
          intX = 3 + intRow2;
          intY = 300 + 3 + intColumn2;

          fill(255);
          noStroke();
          rect(intX + 10, intY, 5, 5);
        }
        }
      }
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = (30 - intRow - 1); intColumn < 30; intColumn++){
        intX = 3 + intRow * 10;
        intY = 3 + intColumn * 10;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section6(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = (1 + intRow - 1); intColumn < 30; intColumn++){
        intX = 303 + intRow * 10;
        intY = 3 + intColumn * 10;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section7(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = (1 - intRow - 1); intColumn < 30; intColumn++){
        intX = 895 - intRow * 10;
        intY = 3 - intColumn * 10;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
  
  public void draw_section8(){
    int intX = 0;
    int intY = 0;

    for(int intColumn = 0; intColumn < 30; intColumn++){
      for(int intRow = (1 + intColumn - 1); intRow < 30; intRow++){
        intX = 900 + 3 + intRow * 10;
        intY = 3 + intColumn * 10;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
}