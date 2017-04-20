package petstore.controller;

import enkan.component.BeansConverter;
import enkan.component.doma2.DomaProvider;
import petstore.dao.PetDao;
import petstore.dao.PetPhotoDao;
import petstore.dao.PetTagDao;
import petstore.entity.Pet;
import petstore.entity.PetPhoto;
import petstore.entity.PetTag;

import javax.inject.Inject;
import javax.transaction.Transactional;

/**
 * @author kawasima
 */
public class PetController {
    @Inject
    private DomaProvider daoProvider;

    @Inject
    private BeansConverter beansConverter;

    @Transactional
    public void createPet(petstore.model.Pet petArg) {
        PetDao petDao = daoProvider.getDao(PetDao.class);
        Pet pet = beansConverter.createFrom(petArg, Pet.class);
        pet.setCategoryId(petArg.getCategory().getId());
        petDao.insert(pet);

        PetPhotoDao petPhotoDao = daoProvider.getDao(PetPhotoDao.class);
        petArg.getPhotoUrls().forEach(url -> petPhotoDao.insert(new PetPhoto(pet.getId(), url)));

        PetTagDao petTagDao = daoProvider.getDao(PetTagDao.class);
        petArg.getTags().forEach(tag -> petTagDao.insert(new PetTag(pet.getId(), tag.getId())));

        return;
    }
}
