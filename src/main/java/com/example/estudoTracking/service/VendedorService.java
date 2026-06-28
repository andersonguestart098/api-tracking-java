package com.example.estudoTracking.service;

import com.example.estudoTracking.DTO.VendedorRequestDTO;
import com.example.estudoTracking.DTO.VendedorResponseDTO;
import com.example.estudoTracking.exception.RecursoNaoEncontrado;
import com.example.estudoTracking.mapper.VendedorMapper;
import com.example.estudoTracking.model.Vendedor;
import com.example.estudoTracking.repository.VendedorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class VendedorService {

    private final VendedorRepository vendedorRepository;

    private final VendedorMapper vendedorMapper;

    public final VendedorResponseDTO cadastrar(VendedorRequestDTO dto) {

        Vendedor vendedor = vendedorMapper.toEntity(dto);

        Vendedor vendedorSalvo = vendedorRepository.save(vendedor);

        return vendedorMapper.toDTO(vendedorSalvo);

    }

    public Page<VendedorResponseDTO> listar(Pageable pageable) {

        return vendedorRepository.findAll(pageable)
                .map(vendedorMapper::toDTO);

    }

    public VendedorResponseDTO buscar(String codVend) {

        return vendedorRepository.findByCodVend(codVend)
                .map(vendedorMapper::toDTO)
                .orElseThrow(() -> new RecursoNaoEncontrado("Vendedor não localizado pelo código"));


    }


}
