from models.book import Book

book1 = Book("The Bell Jar", "Sylvia Plath", "Novel", True)
book2 = Book("ARTocracy", "Nuno Sacramento", "Non Fiction", False)
book3 = Book("Aquablue", "Thierry Cailleteau", "Graphic Novel", False)

catalogue = [book1, book2, book3]

def get_record(index):
    return catalogue[index]

def add_record(new_record):
    catalogue.append(new_record)
    return catalogue

def delete_record(record_title):
    record_to_delete = None
    for record in catalogue:
        if record.title == record_title:
            record_to_delete = record
            break

    catalogue.remove(record_to_delete)