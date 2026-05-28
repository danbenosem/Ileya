import unittest


from even_odd import*



class TestEvenOdd(unittest.TestCase):
    

    def test_correctResult(self):
        self.assertEqual(even_odd([45, 60, 3, 10, 9, 22]),[[45, 3, 9], [60, 10, 22]])
