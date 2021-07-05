package com.game.snake

import javax.swing._

object Main {

  lazy val frame: GameFrame = new GameFrame()
  lazy val window: JFrame = new JFrame() {
    this setPreferredSize new java.awt.Dimension(1000, 800)
    this setTitle "Snake Game"
    this setDefaultCloseOperation WindowConstants.EXIT_ON_CLOSE
    this setResizable false
    this addWindowListener frame
    this add frame
    this.pack()
  }

  def main(args: Array[String]): Unit = {
    window setVisible true
  }

}
