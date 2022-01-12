package com.example.guestBook;

import com.example.guestBook.dto.GuestbookDTO;

public interface GuestbookService {
    Long register(GuestbookDTO dto);
}
