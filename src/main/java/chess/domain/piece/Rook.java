package chess.domain.piece;

import chess.domain.board.DirectionType;
import chess.domain.board.PlayerType;
import chess.domain.board.Point;

public class Rook extends Piece {

    public Rook(PlayerType playerType) {
        super(playerType);
    }

    @Override
    public boolean isMovable(Point prev, Point next) {
        DirectionType directionType;
        try {
            directionType = DirectionType.valueOf(prev, next);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return DirectionType.isStraightDirection(directionType);
    }

    @Override
    public String pieceToString() {
        return isWhite() ? "r" : "R";
    }
}
