package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.DeleteProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.devs.business.responses.GetByIdProgrammingLanguageResponse;

public interface ProgrammingLanguageService {

	List<GetAllProgrammingLanguagesResponse> getAll();

	GetByIdProgrammingLanguageResponse getById(int id);

	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);

	void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);

	void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest);

}
