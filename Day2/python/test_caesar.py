import unittest

from caesar import encrypted_text

class TestCaesarCipher(unittest.TestCase):

    def test_standard_lowercase(self):
        self.assertEqual(encrypted_text("abc", 3), "def")

    def test_standard_uppercase(self):
        self.assertEqual(encrypted_text("ABC", 3), "DEF")

    def test_lowercase_overflow(self):
        self.assertEqual(encrypted_text("xyz", 3), "abc")

    def test_uppercase_overflow(self):
        self.assertEqual(encrypted_text("XYZ", 3), "ABC")

    def test_massive_shift(self):
        self.assertEqual(encrypted_text("abc", 29), "def")

    def test_mixed_case(self):
        self.assertEqual(encrypted_text("HelloZ", 4), "LippsD")


