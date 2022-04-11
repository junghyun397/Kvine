package jrenju

import jrenju.BoardIO.BoardToText
import jrenju.ComplexCase.T2
import jrenju.notation.Pos
import org.scalatest._
import org.scalatest.flatspec._
import org.scalatest.matchers._

class BoardIOTest extends AnyFlatSpec with should.Matchers {

  "Board IO" should "injection function" in {
    val board = (
        "   A B C D E F G H I J K L M N O   \n" +
        "15 . . . . . . . . . . . . . . . 15\n" +
        "14 . . . . . . . . . . . . . . . 14\n" +
        "13 . . . . . . . . . O . . . . . 13\n" +
        "12 . . . . . . . O X X . . . . . 12\n" +
        "11 . . . . . . . . . . O O . . . 11\n" +
        "10 . . . . O X O O O X . . . . . 10\n" +
        " 9 . . . X X O O X X . . . . . . 9 \n" +
        " 8 . . . O X X X O X O . . . . . 8 \n" +
        " 7 . . . X . O O O X X O . . . . 7 \n" +
        " 6 . . O O X X X . O O X . . . . 6 \n" +
        " 5 . X O O O X . X O X . O . . . 5 \n" +
        " 4 . . O X X X O X O X . . . . . 4 \n" +
        " 3 . . . . . O . . O . . . . . . 3 \n" +
        " 2 . . . . . . . . X . . . . . . 2 \n" +
        " 1 . . . . . . . . . . . . . . . 1 \n" +
        "   A B C D E F G H I J K L M N O   "
      )
      .t2b(Pos.fromCartesian("I", 2).get.idx)

    board.boardText should be (BoardIO.fromBoardText(board.boardText, 0, Option.empty).get.boardText)
  }

}