def encrypted_text( text, shift):
    result = ""
    
    
    shift = shift % 26
    
    for index in range(len(text)):
        letter = text[index]
        
        
        shifted_letter = chr(ord(letter) + shift)
        
        
        if letter.isupper() and shifted_letter > 'Z':
            shifted_letter = chr(ord(shifted_letter) - 26)
            
        
        elif letter.islower() and shifted_letter > 'z':
            shifted_letter = chr(ord(shifted_letter) - 26)
            
        result = result + shifted_letter
        
    return result

