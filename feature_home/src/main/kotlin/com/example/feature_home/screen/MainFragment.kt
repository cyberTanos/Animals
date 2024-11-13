package com.example.feature_home.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.core.di.CoreProvider
import com.example.feature_home.R
import com.example.feature_home.databinding.FragmentMainBinding
import com.example.feature_home.di.DaggerFeatureComponent
import javax.inject.Inject

class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var vmFactory: ViewModelProvider.Factory

    private val vm: MainVM by lazy {
        ViewModelProvider(this, vmFactory)[MainVM::class.java]
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val coreComponent = (requireActivity().application as CoreProvider).getCoreComponent()
        DaggerFeatureComponent.factory().create(coreComponent).inject(this)
        observeVM()
        bindUI()
        return binding.root
    }

    private fun observeVM() {
        vm.cat.observe(viewLifecycleOwner) {
            Glide.with(this).load(it).into(binding.catImage)
        }
        vm.dog.observe(viewLifecycleOwner) {
            Glide.with(this).load(it).into(binding.dogImage)
        }
    }

    private fun bindUI() {
        binding.buttonCat.setOnClickListener {
            vm.getCat()
        }
        binding.buttonDog.setOnClickListener {
            vm.getDog()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
