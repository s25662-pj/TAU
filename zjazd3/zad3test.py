import unittest
from zad3 import generate_board, move_player

class TestGame(unittest.TestCase):

    def setUp(self):
        """Przygotowuje dane do testów, aby nie powtarzać kodu w każdym teście."""
        self.board_size = 5
        self.obstacles_count = 5
        self.board, self.start_pos, self.end_pos = generate_board(self.board_size, self.obstacles_count)

    def test_generate_board(self):
        """Testuje generowanie planszy z przeszkodami i sprawdza poprawność pozycji startowej oraz końcowej."""
        self.assertEqual(self.board[self.start_pos[0]][self.start_pos[1]], "A")
        self.assertEqual(self.board[self.end_pos[0]][self.end_pos[1]], "B")
        self.assertNotEqual(self.start_pos, self.end_pos)

        # Zlicza ilość przeszkód na planszy
        obstacle_count = sum(row.count("X") for row in self.board)
        self.assertEqual(obstacle_count, self.obstacles_count)

    def test_move_player_valid(self):
        """Testuje poprawność ruchu gracza na planszy (ruchy dozwolone)."""
        board = self._get_sample_board()
        player_pos = (2, 2)

        # Testujemy ruch gracza w prawo, w górę, w lewo i w dół
        self._assert_player_move(board, player_pos, "d", (2, 3))
        self._assert_player_move(board, (2, 3), "w", (1, 3))
        self._assert_player_move(board, (1, 3), "a", (1, 2))
        self._assert_player_move(board, (1, 2), "s", (2, 2))

    def test_move_player_invalid(self):
        """Testuje próby wykonania niepoprawnych ruchów (np. w ścianę)."""
        board = self._get_sample_board()
        player_pos = (0, 2)

        # Próby ruchów, które nie powinny zmienić pozycji gracza
        self._assert_player_move(board, player_pos, "s", player_pos)
        self._assert_player_move(board, player_pos, "w", player_pos)

    def test_end_game(self):
        """Testuje warunki zakończenia gry po dotarciu do mety."""
        board = [
            [" ", " ", "A", " ", "B"],
            [" ", "X", "X", " ", " "],
            [" ", " ", " ", " ", " "],
            [" ", " ", "X", " ", " "],
            [" ", " ", " ", " ", " "],
        ]
        player_pos = (0, 2)
        end_pos = (0, 4)

        # Przemieszczanie gracza, aby dotrzeć do mety
        player_pos = move_player("d", player_pos, board)
        self.assertNotEqual(player_pos, end_pos)

        player_pos = move_player("d", player_pos, board)
        self.assertEqual(player_pos, end_pos)

    def test_illegal_move(self):
        """Testuje próbę wykonania nieistniejącego ruchu."""
        board = self._get_sample_board()
        player_pos = (0, 2)

        # Próba ruchu nieistniejącą komendą
        new_pos = move_player("dw", player_pos, board)
        self.assertEqual(new_pos, player_pos)

    def _get_sample_board(self):
        """Pomocnicza funkcja do zwrócenia przykładowej planszy do testów."""
        return [
            [" ", " ", " ", " ", " "],
            [" ", "X", " ", " ", " "],
            [" ", " ", "A", " ", " "],
            [" ", " ", "X", " ", " "],
            [" ", " ", " ", " ", "B"],
        ]

    def _assert_player_move(self, board, player_pos, direction, expected_pos):
        """Pomocnicza funkcja do sprawdzania, czy ruch gracza prowadzi do oczekiwanej pozycji."""
        new_pos = move_player(direction, player_pos, board)
        self.assertEqual(new_pos, expected_pos)

if __name__ == "__main__":
    unittest.main()
